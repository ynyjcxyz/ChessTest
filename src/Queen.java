class Queen extends Piece{
    Piece queen = new Queen();
    boolean isValidMove(Position newPosition){
        if((newPosition.column == this.column || newPosition.row == this.row) || (Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row))){
            return true;
        }
        else{
            return false;
        }
    }
    /*
    Piece queen = new Queen();
    Position testPosition = new Position(3,10);
    if(queen.isValidMove(testPosition)){
        System.out.println("Yes, I can move there.")
    }
    else{
        System.out.println("Nope, can't do!");
    }
    */
}