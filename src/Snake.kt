// The class representing the Snake in SnakeGame
class Snake(var init_row: Int, var init_col: Int) {

    // List containing all snake segments
    private var snakeList = mutableListOf<Cell>()

    // Init the head of the snake
    init {
        snakeList.add(0, Cell(row = init_row, col = init_col, type = CellType.SNAKE))
    }

    // Function for expanding the snake length
    fun grow(row: Int, col: Int){
        snakeList.add(Cell(row, col, CellType.SNAKE))
    }

    fun move(direction: MoveDirection){
        var head_row = snakeList.last().row
        var head_col = snakeList.last().col
    }
}

// Enum containing all possible directions that the snake can move to
enum class MoveDirection {
    LEFT,
    RIGHT,
    UP,
    DOWN
}
