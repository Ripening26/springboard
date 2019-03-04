package cafe.ebs.web.springboard.vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardRequest {
	private int boardNo;
	private String boardPw;
	private String boardTitle;
	private String boardContent;
	private String boardUser;
	private String boardDate;
	private List<MultipartFile> files;
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardPw() {
		return boardPw;
	}
	public void setBoardPw(String boardPw) {
		this.boardPw = boardPw;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardUser() {
		return boardUser;
	}
	public void setBoardUser(String boardUser) {
		this.boardUser = boardUser;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public List<MultipartFile> getFileList() {
		return files;
	}
	public void setFileList(List<MultipartFile> fileList) {
		this.files = fileList;
	}
	@Override
	public String toString() {
		return "boardRequest [boardNo=" + boardNo + ", boardPw=" + boardPw + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardUser=" + boardUser + ", boardDate=" + boardDate
				+ ", fileList=" + files + "]";
	}
	
}
