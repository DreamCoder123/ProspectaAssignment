# ProspectaAssignment

Theoratical Challenge Question 2.

To tackle the challenge above, I would write a program that reads the CSV input, processes the data, calculates the formulas, and writes the results to a new CSV file.

The following steps could be taken to solve this challenge:

1)  Parse the CSV input and store it in a data structure that allows us to refer to cells by their row and column indices.

2)  Iterate over each cell in the data structure and check whether it contains a formula or a value. If it contains a formula, evaluate the formula and store the           resulting value in the cell. If it contains a value, simply store the value in the cell.

3)   Write the results to a new CSV file.

While implementing the above solution, we need to check for various errors, such as:

Circular references: We should check for circular references, where a formula depends on its own value, or on the value of another cell that depends on the formula's                         own value. This can result in an infinite loop while evaluating the formula, and should be avoided.

Division by zero: We should check for division by zero errors, which can occur when a formula divides a value by zero.

Syntax errors: we should check for syntax errors in the formula, such as invalid characters or incorrect usage of functions.
                Users can break the code in various ways, such as:

Providing invalid input: users can provide input in an invalid format, such as a CSV file that doesn't follow the expected format. We should check for such errors and                          provide informative error messages.

NumberFormatExcpetion: if any of the values in the CSV file are not valid numbers. For example, if the value of A1 was "five" instead of "5", then attempting to use it                        in a calculation would result in a NumberFormatException, To handle this error, the program could catch the NumberFormatException and handle it                        appropriately, such as skipping the calculation for the invalid value or providing a helpful error message to the user.

Bad Operant type:  if the program attempts to perform an operation on incompatible data types. For example, if the value of A1 is a string like "five" and the program                    attempts to add it to another number, then a "bad operand type" error could occur because the + operator expects two numbers.
                   To handle this error, the program could validate the data types of the values before attempting any calculations. If the value is not a valid                          number, it could be skipped or an error message could be displayed to the user.

Causing performance issues: Users can provide input that causes performance issues, such as large CSV files or formulas that take a long time to evaluate. We should optimize our code to handle such cases efficiently.
