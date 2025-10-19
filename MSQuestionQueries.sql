-- =========================
-- Create table (no ENUMs)
-- =========================
-- CREATE TABLE question (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     question VARCHAR(500) NOT NULL,
--     option_a VARCHAR(255) NOT NULL,
--     option_b VARCHAR(255) NOT NULL,
--     option_c VARCHAR(255) NOT NULL,
--     option_d VARCHAR(255) NOT NULL,
--     correct_option CHAR(1) NOT NULL,             -- Stores 'A','B','C','D'
--     difficulty_level VARCHAR(50) NOT NULL DEFAULT 'Easy',
--     category VARCHAR(50) NOT NULL,              -- e.g., 'java' or 'python'  
-- ) 

-- =========================
-- Seed data (20 rows)
-- =========================
INSERT INTO question
(question, option_a, option_b, option_c, option_d, correct_option, difficulty_level, category)
VALUES
-- ===== JAVA (10) =====
('Which collection guarantees insertion order?', 'HashSet', 'LinkedHashSet', 'TreeSet', 'PriorityQueue', 'B', 'Easy', 'java'),
('Which keyword prevents a class from being subclassed?', 'final', 'static', 'sealed', 'abstract', 'A', 'Easy', 'java'),
('What does the JVM primarily execute?', 'Source code', 'Bytecode', 'Native C code', 'Assembly', 'B', 'Easy', 'java'),
('Which interface does ArrayList implement?', 'Deque', 'Set', 'List', 'Map', 'C', 'Easy', 'java'),
('Default value of an uninitialized int field in a class?', '0', '1', 'null', 'Undefined', 'A', 'Easy', 'java'),
('Which block runs whether or not an exception is thrown?', 'catch', 'final', 'finally', 'throw', 'C', 'Easy', 'java'),
('Which functional interface represents a function T -> R?', 'Supplier<T>', 'Consumer<T>', 'Function<T,R>', 'Predicate<T>', 'C', 'Medium', 'java'),
('Stream terminal operation that reduces elements to one value?', 'map', 'filter', 'reduce', 'peek', 'C', 'Medium', 'java'),
('Which method starts a Thread''s execution?', 'run()', 'start()', 'execute()', 'begin()', 'B', 'Medium', 'java'),
('Volatile guarantees which memory property?', 'Atomicity for all ops', 'Visibility across threads', 'Mutual exclusion', 'Ordering undefined', 'B', 'Hard', 'java'),

-- ===== PYTHON (10) =====
('What is the output type of range(5) in Python 3?', 'list', 'tuple', 'range object', 'generator', 'C', 'Easy', 'python'),
('Which keyword creates an anonymous function?', 'func', 'lambda', 'def', 'anon', 'B', 'Easy', 'python'),
('What does list.append(x) do?', 'Returns new list', 'Adds x and returns None', 'Inserts at start', 'Extends by iterable', 'B', 'Easy', 'python'),
('Which data type is immutable?', 'list', 'dict', 'set', 'tuple', 'D', 'Easy', 'python'),
('How do you create a set literal with elements 1 and 2?', '{1, 2}', '[1, 2]', '(1, 2)', 'set[1, 2]', 'A', 'Easy', 'python'),
('What does the // operator do?', 'True division', 'Floor division', 'Modulo', 'Exponentiation', 'B', 'Easy', 'python'),
('Which statement correctly opens a file for reading text?', 'open("f.txt","w")', 'open("f.txt","r")', 'open("f.txt","a")', 'open("f.txt","rb")', 'B', 'Medium', 'python'),
('Which is a valid list comprehension?', '[x for x in range(3)]', '(x for x in range(3))', '{x for x in range(3)}', '{x: x for x in range(3)}', 'A', 'Medium', 'python'),
('What will len({1: "a", 2: "b"}) return?', '1', '2', '3', 'Error', 'B', 'Medium', 'python'),
('What does @staticmethod in a class do?', 'Binds to instance', 'Receives cls as first arg', 'No implicit self/cls', 'Is abstract by default', 'C', 'Hard', 'python');
