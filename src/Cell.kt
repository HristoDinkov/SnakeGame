// The cell class
class Cell(val row:Int, val col:Int, var type: CellType){

}

// Enum for the different cell types
enum class CellType {
    BRICK,
    GRASS,
    SNAKE,
    APPLE
}
