/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmaschessgame;


public class ChristmasChessGame {

    public static String A1="Rook_White.png",A2="Knight_White.png",A3="Bishop_White.png",A4="Queen_White.png",A5="King_White.png",A6="Bishop_White.png",A7="Knight_White.png",A8="Rook_White.png";
    public static String B1="Pawn_White.PNG",B2="Pawn_White.PNG",B3="Pawn_White.PNG",B4="Pawn_White.PNG",B5="Pawn_White.PNG",B6="Pawn_White.PNG",B7="Pawn_White.PNG",B8="Pawn_White.PNG";
    public static String C1,C2,C3,C4,C5,C6,C7,C8;
    public static String D1,D2,D3,D4,D5,D6,D7,D8;
    public static String E1,E2,E3,E4,E5,E6,E7,E8;
    public static String F1,F2,F3,F4,F5,F6,F7,F8;
    public static String G1="Pawn_Black.png",G2="Pawn_Black.png",G3="Pawn_Black.png",G4="Pawn_Black.png",G5="Pawn_Black.png",G6="Pawn_Black.png",G7="Pawn_Black.png",G8="Pawn_Black.png";
    public static String H1="Rook_Black.png",H2="Knight_Black.png",H3="Bishop_Black.png",H4="Queen_Black.png",H5="Bishop_King.png",H6="Bishop_Black.png",H7="Knight_Black.png",H8="Rook_Black.png";   
    
    public static String Go="White";
    public static String PieceMoved;
    
    public static void main(String[] args) {
        ABoard menu = new ABoard();
        menu.setSize(800,650);
        menu.setVisible(true);
    }
    
}
