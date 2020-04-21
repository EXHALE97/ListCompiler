grammar Grammar;

SPACE : [ \t\n\r]+ -> skip;
STRING : '"'(.)+?'"';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
PRINT : 'Print';
VOID : 'Void';
LIST : 'List';
ELEMENT : 'Element';
COMMA : ',';
NAME : [a-z]+;
NUMBER : [0-9]+;
ASSIGNMENT : '=';
FOR : 'For';
IS_EMPTY : 'IsEmpty';
CONTAINS : 'Contains';
IF : 'If';
ELSE : 'Else';
EQUAL : '==';
CLEAR : 'Clear';
ADD : 'Add';
GET : 'Get';
REMOVE : 'Remove';
SIZE : 'Size';
GE : '>=';
GT : '>';
LE : '<=';
LT : '<';
PLUS : '+';

program : block functionDefine*;
block : OPEN_CURLY_BRACKET content* CLOSE_CURLY_BRACKET;
print : PRINT OPEN_BRACKET (STRING | NAME | size) CLOSE_BRACKET;
content : print | functionCall | forCycle | elementDeclaration | listDeclaration | ifBlock | add | clear | remove | concate;
type : LIST | ELEMENT;
functionDefine : VOID NAME OPEN_BRACKET type NAME (COMMA type NAME)* CLOSE_BRACKET block;
functionCall : NAME OPEN_BRACKET NAME (COMMA NAME)* CLOSE_BRACKET;
forCycle : FOR OPEN_BRACKET NAME COMMA NAME CLOSE_BRACKET block;
elementDeclaration : (ELEMENT NAME) | (ELEMENT? NAME ASSIGNMENT (STRING | NAME | get));
listDeclaration : (LIST NAME) | (LIST? NAME ASSIGNMENT NAME);
equalNames : NAME EQUAL NAME;
contains : CONTAINS OPEN_BRACKET NAME COMMA NAME CLOSE_BRACKET;
is_empty : IS_EMPTY OPEN_BRACKET NAME CLOSE_BRACKET;
compare : equalNames | contains | is_empty | compareGE | compareGT | compareLE | compareLT | compareEQ;
ifBlock : IF OPEN_BRACKET compare CLOSE_BRACKET block elseBlock?;
elseBlock : ELSE block;
add : ADD OPEN_BRACKET NAME COMMA NAME CLOSE_BRACKET;
clear : CLEAR OPEN_BRACKET NAME CLOSE_BRACKET;
get : GET OPEN_BRACKET NAME COMMA NUMBER CLOSE_BRACKET;
remove : REMOVE OPEN_BRACKET NAME COMMA (NAME | NUMBER) CLOSE_BRACKET;
size : SIZE OPEN_BRACKET NAME CLOSE_BRACKET;
compareGE : size GE NUMBER;
compareGT : size GT NUMBER;
compareLE : size LE NUMBER;
compareLT : size LT NUMBER;
compareEQ : size EQUAL NUMBER;
concate : PLUS OPEN_BRACKET NAME COMMA NAME CLOSE_BRACKET;