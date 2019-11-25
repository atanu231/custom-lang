grammar Blang;

@header {
    package com.lang.blang.config.antlr4;
}

parse
 : block EOF
 ;

block
 : ( statement | functionDecl )* ( Return expression ';' )? 
 ;

statement
 : assignment ';'
 | functionCall ';'
 | ifStatement
 | forStatement
 | forEachStatement
 | whileStatement
 | verbStatement
 | relationStatement ';'
 | setNounStatement ';'
 | compositeStatement 
// | expression
 ;

assignment
 : Identifier indexes? '=' expression         #varAndArrayAssignment
 | Identifier('.'Identifier)+ '=' expression  #tablePropertyAssignment
 | Identifier('.'String) '=' expression      #tablePropertyStringAssignment
 | String '=' expression                     #tableStringPropertyAssignment
 ;

functionCall
 : Identifier '(' exprList? ')' #identifierFunctionCall
 | Println '(' expression? ')'  #printlnFunctionCall
 | Print '(' expression ')'     #printFunctionCall
 | Assert '(' expression ')'    #assertFunctionCall
 | Size '(' expression ')'      #sizeFunctionCall
 | RoundOf '('  expression ( ',' expression )')'   #roundOfFunctionCall
 | ReplaceNull '('  expression ( ',' expression )')' #replaceNullFunctionCall
 | ReplaceNullOrEmpty '('  expression ( ',' expression )')' #replaceNullOrEmptyFunctionCall
 | Sum'('expression')'          #sumFunctionCall
 | Avg'('expression')'          #avgFunctionCall
 | Abs'('expression')'          #absFunctionCall
 
 ;



ifStatement
 : ifStat elseIfStat* elseStat? End
 ;

ifStat
 : If expression Do block
 ;

elseIfStat
 : Else If expression Do block
 ;

elseStat
 : Else Do block
 ;

functionDecl
 : Def Identifier '(' idList? ')' block End
 ;

forStatement
 : For Identifier '=' expression To expression Do block End
 ;
 
forEachStatement
 : For Each Identifier In expression Do block End
 ;

whileStatement
 : While expression Do block End
 ;

verbStatement
 : fetchStatement ';'
 | calculateStatement ';'
 | selectStatement 
 ;
 
selectStatement
 : Select nouns? ds? prepositions?  filters? (Conjunctions filters)* orderby? ';'
 ;
 
ds
 : From? Identifier
 | Of? Identifier
 ; 
 
nouns
 : nounorfunction (',' nounorfunction)*
 ;
 
nounorfunction
: Identifier                     #nounfilter
 | String                        #stringfilter
 | Identifier'('Identifier (',' expression)*')'  #windowFuncNounFilter
 | Identifier'('String (',' expression)*')'  #windowFuncStringFilter
 ;
filters
 : nounorfunction (criteriaexpr)*    
 ;

orderby
 : 'by asc('Identifier(','Identifier)*')'        #ascOrder
 | 'by desc('Identifier(','Identifier)*')'       #descOrder
 | 'by asc('String(','String)*')'                #stringAscOrder
 | 'by desc('String(','String)*')'               #stringDescOrder
 ;
 
criteriaexpr
 : Conjunctions? op=(GTEquals | LTEquals | GT | LT | In | Notin | Equals | NEquals) expression 
 ;
 
relationStatement
 : Relations'['relationStat?']'
 ;
 
relationStat
 : relationClause  ( ',' relationClause )*
 ;
 
relationClause
 : Identifier.Identifier('->'Identifier.Identifier)?
 ;
 
setNounStatement
 : Set Noun Identifier '=' expression
 ;
 
fetchStatement
 : Get nounList dsBlock? prepositions?  filterCriteria?
 ;
 
calculateStatement
 : Calculate Identifier
 ;
 
compositeStatement
 : Create Composite '(' StringLines ')' As Identifier ';'
 ;
 
dsBlock
 : From? Identifier
 | Of? Identifier
 ; 
 
/*filterList
 : time_period filterList?                             #timePeriodFilter
 | nounList filterList?                                #nounFilterList
 | Equals expression filterList?                       #equalFilter
 | NEquals expression filterList?                      #nonEqualFilter
 | GTEquals expression filterList?                     #greaterEqualFilter
 | LTEquals expression filterList?                     #lessEqualFilter
 | GT expression filterList?                           #greaterthanFilter
 | LT expression filterList?                           #lessthanFilter
 | In expression filterList?                           #inFilter
 | Notin expression filterList?                        #notInFilter
 | Conjunctions filterList?                            #conjunctionFilter
 | prepositions filterList?                            #prepositionFilter
 ;*/
 
filterCriteria
 : nounList (criteria)*
 | filterCriteria Conjunctions filterCriteria
 ;
 
criteria
 : Conjunctions? op=(GTEquals | LTEquals | GT | LT | In | Notin | Equals | NEquals) expression 
 ;

time_period
 : op=( Last | First ) expression Years                 #lastTimePeriodFilter
 | Between expression To expression                     #betweenPeriodFilter
 | Since expression                                     #sinceFilter
 ; 
 
prepositions
 :  Where
 | Of
 | Between
 ;
 
Conjunctions
 : And | Or
 ;

  
nounList
 :String ( ',' String )*
 ;

idList
 : Identifier ( ',' Identifier )*
 ;

exprList
 : expression ( ',' expression )*
 ;

expression
 : '-' expression                                       #unaryMinusExpression
 | '!' expression                                       #notExpression
 | <assoc=right> expression '^' expression              #powerExpression
 | expression op=( '*' | '/' | '%' ) expression         #multExpression
 | expression op=( '+' | '-' ) expression               #addExpression
 | expression op=( '>=' | '<=' | '>' | '<' ) expression #compExpression
 | expression op=( '==' | '!=' ) expression             #eqExpression
 | expression '&&' expression                           #andExpression
 | expression '||' expression                           #orExpression
 | expression '?' expression ':' expression             #ternaryExpression
 | expression In expression                             #inExpression
 | expression StartsWith expression                     #startsWithExpression
 | expression Like expression                           #likeExpression
 | expression NotLike expression                        #notLikeExpression
 | expression EndsWith expression                       #endsWithExpression
 | Number                                               #numberExpression
 | Bool                                                 #boolExpression
 | Null                                                 #nullExpression
 | functionCall indexes?                                #functionCallExpression
 | list indexes?                                        #listExpression
 | Identifier indexes?                                  #identifierExpression
 | String indexes?                                      #stringExpression
 | '(' expression ')' indexes?                          #expressionExpression
 | Input '(' String? ')'                                #inputExpression
 | verbStatement                                        #verbExpression
 | Identifier'.'String                                  #tableRowPropertyExpression
 | dateExpression                                       #dateRuleExpression
 | Copyof'('expression')'                               #copyOfExpression
 | aggregateFunctionCall                                #aggregateExpression
 | Next'('').'String                                    #nextRowValueExpression
 ;

list
 : '[' exprList? ']'
 ;
 
aggregateFunctionCall
 : Sum'('String')' ds? orderby? (By String)? ( ',' String )*
 ;

indexes
 : ( '[' expression ']' )+
 ;
 
dateExpression
 : CurrentYear
 | CurrentDate
 | CurrentTime
 ;

CurrentYear : 'current year';
CurrentTime : 'current time';
CurrentDate : 'current date';
Println  : 'println';
Print    : 'print';
Input    : 'input';
Assert   : 'assert';
Size     : 'size';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Notin    : 'not in';
Null     : 'null';
Each     : 'each';
As       : 'as';

Or       : '||' | 'or';
And      : '&&' | 'and';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';

Get      : 'GET' | 'FETCH' | 'get' | 'fetch';
From     : 'from';
Of       : 'of';
Where    : 'where';
Between  : 'between';
Last     : 'last';
First    : 'first';
Years    : 'years' | 'yrs' ;
Relations: 'relations'|'relation';
Set      : 'set';
Noun     : 'noun';
Create   : 'create';
Composite: 'composite';
Calculate: 'calculate';
RoundOf  : 'roundof';
ReplaceNull : 'replacenull';
ReplaceNullOrEmpty : 'replacenullorempty';
StartsWith  : 'starts with';
Like     : 'like';
EndsWith    : 'ends with';
Select      : 'select';
Sum         : 'sum';
Avg         : 'avg';
Copyof      : 'copyof';
By          : 'by';
Abs         : 'abs';
NotLike     : 'not like';
Next        : 'next';


 
  

Bool
 : 'true' 
 | 'false'
 ;

Number
 : Int ( '.' Digit* )?
 ;
 
Since
 : 'since'|'from'
 ;

Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;


String
 : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
 | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
 ;
 
StringLines
 :["](.*?)["]
 ;

Comment
 : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;
 

fragment Int
 : [1-9] Digit*
 | '0'
 ;
  
fragment Digit 
 : [0-9]
 ;
 
