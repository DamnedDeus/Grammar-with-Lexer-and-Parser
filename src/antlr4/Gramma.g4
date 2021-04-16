grammar Gramma;

PT: '.';
NUM: ([0-9]+) | '{' NAME (',' NAME)* '}' | '{' NUM (',' NUM)* '}'
                    | '"'([a-z]|[A-Z]|[0-9]|' ')*'"' | ([0-9]+PT[0-9]+'f');

TYPE: 'Integer' | 'Float' | 'String' | 'Table' | 'Row' | 'Column';
MULT: '*';
DIV: '/';
PLUS: '+';
MINUS: '-';
LOGIC: '&&' | '||';
COMPARE: '!=' | '==' | '<' | '>' | '>=' | '<=';
UNARY_OPERATOR: '--' | '++';
MAIN_FUNCTION_ID: 'main';
NAME : [a-z]([a-z]|[A-Z]|[0-9])*;

parametr: (TYPE NAME | NUM | NAME )?;
identifier: NAME '=' (NUM | function_call );

unary_operator
    : NAME UNARY_OPERATOR #left
    | UNARY_OPERATOR NAME #rigth
    ;
expression
    : unary_operator  #unaryOperator
    | TYPE (identifier | (NAME '=' expression)) #defineVar
    | '(' expression ')' #parens
    | expression operation =(MULT|DIV) expression #mulDiv
    | expression operation =(PLUS|MINUS) expression #plusMinus
    | expression operation =COMPARE expression #compare
    | expression operation = LOGIC expression #logic
    | expression '^' expression #idk
    | '!' expression #not
    | NAME '=' (function_call | expression) #varEqlsFunc
    | NUM #num
    | NAME #name
    | '('TYPE')' (NUM|NAME) #typeConverter
    | identifier #id
    | NAME PT 'find(' parametr (',' parametr)* ')' #find
    | NAME PT 'update' '(' parametr (',' parametr)* ')' #update
    | NAME PT 'delete' '(' parametr')' #delete
    | 'new' TYPE '(' (parametr)? (',' parametr)* ')' #create
    ;


Whitespace:[ \t\n\r]+ -> skip;
function: TYPE NAME '(' (parametr (',' parametr)*)? ')' '{' statement* return_rule '}' ;
mainFunction: MAIN_FUNCTION_ID '()' '{' statement* '}';
function_call: NAME '(' (parametr) (',' parametr)* ')';

return_rule: 'return' ((expression) | function_call);
if_rule: 'if' '(' expression ')' '{' (statement)* '}' else_rule?;
else_rule: ('else'  '{' statement+ '}');
while_rule: 'while' '(' expression')' '{' (statement)* '}';
for_rule: 'for' '('expression';'expression';'expression')' '{' statement* '}';
break_rule: 'break';
continue_rule: 'continue';
statement_rules: (if_rule |while_rule|for_rule|break_rule|continue_rule|(expression)+ |function_call | function);
statement: statement_rules+;

program: (function)* mainFunction (function)*;