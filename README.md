# Структура
- Код:

  **CompilerVisitor** содержит реализованные методы, которые позволяют выполнять определенный действия при обходе написанного кода для компилятора (синтаксического дерева).
  
  **Constant** содержит шаблон кода, который описывает работу с List и Element, он вставляется в код конечной программы.
  
  **Grammar.g4** — файл грамматики.
  
  **Memory** — класс для хранения значений переменных.
  
  В **Main** считывается через CharStream файл с написанным кодом, создается синтаксическое дерево и через Visitor формируется конечный код и сохраняется в .java файл.
  
- Папка gen:
  
  В **gen** хранятся файлы, сгенерированные ANTLR по .g4 файлу.
  
  **GrammarParser** —  описание класса парсера, то есть синтаксического анализатора, отвечающего написанной грамматике.
  
  **GrammarLexer** —  описание класса лексера, или лексического анализатора, отвечающего грамматике.
  
  **Grammar.tokens** и **GrammarLexer.tokens** — вспомогательные классы, которые содержат информацию о токенах.
  
  **GrammarListener**, **GrammarBaseListener**, **GrammarVisitor**, **GrammarBaseVisitor**  — это классы, содержащие описания методов, которые позволяют выполнять определенный действия при обходе синтаксического дерева.
  
- Папка test:

  **.bat** файлы позволяют запустить компилятор с необходимым файлом в качестве аргумента командной строки, а потом и запустить полученный конечный код.

  **.txt** файлы хранят в себе код, который будет обрабатываться компилятором.

  **Compiler.jar** - собранный через mvn package проект компилятора.

# Вариант задания

- Язык:

  Язык для работы со списковыми структурами

    1. Встроенные типы: element, list

    2. Операции: переопределить +, -, *, \ и т.д. для встроенных типов
    
- Целевой код: 
  
  Байт-код JVM, формат промежуточного кода – язык Java, генерация целевого кода стандартным компилятором (javac).
  
- Свойства языка:

  Объявление переменных : Явное[1];
  
  Преобразование типов : Не явное;

  Оператор присваивания : Одноцелевой;
  
  Структуры, ограничивающие область видимости : Подпрограммы;

  Маркер блочного оператора : Явный;

  Условные операторы : Двух вариантный оператор if-then-else

  Перегрузка подпрограмм : Отсутствует.

  Передача параметров в подпрограмму: Только по значению и возвращаемому значению.

  Допустимое место объявления подпрограмм: В начале программы.
  
 [1] - По варианту должно быть не явное, однако если речь идет об объявлении через var, то такое в принципе через Java нереально.
 
# Описание работы программы

**ANTLR** — это генератор парсеров, который позволяет создавать парсер по описанию грамматики на одном из основных языков программирования. 

Пишется файл грамматики для своего языка, далее с помощью ANTLR генерируются файлы (у меня встроенный плагин в IntelliJ IDEA), которые описывают методы которые позволяют выполнять определенный действия при обходе синтаксического дерева.

Далее с помощью сгенерированных классов мы можем создать синтаксическое дерево из написанного в .txt файлах кода. Программа считывает текст, из него составляет синтаксическое дерево, а далее проходит по этому дереву и выполняет некоторые действия в зависимости от того, какие данные она читает.

Для того, чтобы программа знала, что ей нужно делать с определенными элементами дерева, есть класс-Visitor. Когда программа встречает некоторый текст, вызывается соответсующий метод, который выполняет необходимые действия.

В конечном итоге сохраняется .java файл (в моем случае) с итоговым кодом.

# Запуск

В папке src/test уже есть 5 примеров и 5 .bat файлов, а также готовый .jar файл. Нужно просто запускать батники.

Конечный java код будет сохранятся в той же папке.