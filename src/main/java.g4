grammar java;

//Lexer

//KeyWords
INT: 'int';
BOOLEAN: 'boolean';
CHAR: 'char';
FLOAT: 'float';
VOID: 'void';

CLASS: 'class';

//not nessesarry (no pacages etc)
PUBLIC: 'public';
PRIVATE: 'private';
STATIC: 'static';
FINAL: 'final';

DO: 'do';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
FOR: 'for';
THIS: 'this';

SEMICOLON:      ';';
DOT:            '.';
QUOTATIONMARK:  '"';

ASSIGN:         '=';


EQUALS:         '==';
GREATER:        '>';
LESS:           '<';
GREATAEREQUALS: '>=';
LESSEQUALS:     '<=';
ADD:            '+';
SUBSTRACT:      '-';
MULTYPLY:       '*';
DIVIDE:         '/';
MOD:            '%';
BITWISEAND:     '&';
BITWISEOR:      '|';
BITWISEXOR:     '^';
SHIFTLEFT:      '<<';
SHIFTRIGHT:     '>>';
USHIFTRIGHT:    '>>>';


AND: '&&';
OR: '||';

//assignments
ASSINGNGREATER:        GREATER ASSIGN;
ASSINGNLESS:           LESS ASSIGN;
ASSINGNGREATAEREQUALS: GREATAEREQUALS ASSIGN;
ASSINGNLESSEQUALS:     LESSEQUALS ASSIGN;
ASSINGNADD:            ADD ASSIGN;
ASSINGNSUBSTRACT:      SUBSTRACT ASSIGN;
ASSINGNMULTYPLY:       MULTYPLY ASSIGN;
ASSINGNDIVIDE:         DIVIDE ASSIGN;
ASSINGNMOD:            MOD ASSIGN;
ASSINGNBITWISEAND:     BITWISEAND ASSIGN;
ASSINGNBITWISEOR:      BITWISEOR ASSIGN;
ASSINGNBITWISEXOR:     BITWISEXOR ASSIGN;


RETURN: 'return';


INCREMENT: '++';
DECREMENT: '--';




IntegerLiteral : [1-9]+[0-9]*|[+-]?'0';
StringLiteral: QUOTATIONMARK .*? QUOTATIONMARK;
CharLiteral : '\'' . '\'';
FloatLiteral: [+-]?[1-9]+[0-9]*'f'
            | [+-]?'0f'
            | [+-]? [0-9]*'.'[0-9]+'f'?;
NullLiteral : 'null';
BooleanLiteral : 'true' | 'false';

Identifyer : [a-zA-Z][a-zA-Z0-9]*;
CustomType :[a-zA-Z][a-zA-Z0-9]*;

WS: [ \r\n\t] + -> skip;

type : INT
     | BOOLEAN
     | FLOAT
     | CHAR
     | CustomType;


literal : IntegerLiteral
        | FloatLiteral
        | CharLiteral
        | BooleanLiteral
        | NullLiteral;

binaryOperator: ADD
              | SUBSTRACT
              | MULTYPLY
              | DIVIDE
              | EQUALS
              | GREATER
              | LESS
              | GREATAEREQUALS
              | LESSEQUALS
              | AND
              | OR
              | MOD
              | BITWISEAND
              | BITWISEOR
              | BITWISEXOR
              | SHIFTLEFT
              | SHIFTRIGHT
              | USHIFTRIGHT
              ;

unaryOperator: INCREMENT
             | DECREMENT
             | ADD
             | SUBSTRACT;


//Grammar

// a .java File can have many classes inside
file: jClass+ EOF;


jClass: modifyer? CLASS Identifyer '{' attributeOrMethod* '}';

attributeOrMethod : attribute
                  | method;

attribute : modifyer? type Identifyer SEMICOLON
          | modifyer? type Identifyer ASSIGN expression SEMICOLON;

statment : RETURN expression?  SEMICOLON  //return statment
         | WHILE '(' expression ')' block //while loop
         //| forLoop // forLoop
         | whileLoop
         | IF '(' expression ')' statment elseIfStatment* elseStatment? //if else if else
         | block //block
         | assinage  // type Identifyer assinage? SEMICOLON? //assing statment
         | varDecl
         | Identifyer unaryOperator //unary operation
         |';'; // empty statment

//statments and statment fractals
block: '{' statment* '}';

varDecl : type Identifyer
        | type assinage;

assinage : Identifyer ASSIGN expression;

// forloop is jaust syntactic sugar ans therfore not used
forLoop :FOR '(' expression ';' expression ';' expression')' statment
        |FOR ;

whileLoop: WHILE '(' expression ')' statment;


elseIfStatment : ELSE IF '(' expression ')'  statment;
elseStatment: ELSE statment;

// expressions

expression: '('expression')'
          | unaryOperator expression
          | expression binaryOperator expression
          | Identifyer
          | literal
          | THIS;


method : modifyer? metodType Identifyer '(' parameter? ')' '{' statment* '}' SEMICOLON?;

parameter : type Identifyer
          | parameter ',' type Identifyer
          ;

modifyer : PRIVATE | PUBLIC | STATIC;

metodType: VOID | type;


