# Groovy map.sum() Unexpected Behavior

This repository demonstrates a common, yet easily overlooked, issue in Groovy when using the `sum()` method on maps.  The `sum()` method, while convenient for summing numerical lists, does not inherently work with maps. Attempting to directly call `sum()` on a map will throw a `MissingMethodException`.

The `bug.groovy` file showcases the problematic code, and `bugSolution.groovy` provides a corrected approach to summing map values.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the `MissingMethodException`.
4. Run `bugSolution.groovy` to see the correct way to sum map values.

## Solution

The solution involves explicitly accessing the map's values and then applying the `sum()` method to that resulting list (or using other appropriate methods like `inject()`).