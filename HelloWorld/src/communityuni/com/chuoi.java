package communityuni.com;

public class chuoi {
    public static void main(String[] args) {
        String path = "D:/music/bolero/longme.mp3";

        int lastSlashIndex = path.lastIndexOf('/');
        String fileNameWithExtension = path.substring(lastSlashIndex + 1);
        
        System.out.println("Tên file đầy đủ: " + fileNameWithExtension);
        int lastDotIndex = fileNameWithExtension.lastIndexOf('.');
        String fileNameOnly = fileNameWithExtension.substring(0, lastDotIndex);
        
        System.out.println("Tên bài hát: " + fileNameOnly);
    }
}
