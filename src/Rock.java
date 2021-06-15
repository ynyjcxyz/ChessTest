public class Rock extends Piece{
    Piece rock = new Rock();
    boolean isValueMove(Position newPosition){
        if(!super.isValidMove(newPosition)){
            return false;
        }
        else if(newPosition.column == this.column && newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }
}