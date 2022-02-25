package gui;

import java.util.Vector;

import javax.swing.JList;

public interface PanelInterface extends GuiInterface {
	public void setTextToLogWindow(String str);
	public void setUserList(Vector<String> userList);
	public JList getJList();
	public void unShow();
	public String getInputText();
	public void setTextToInput(String string);
	public void setUserListFrame(UserListFrame userListFrame);
	public int[] getFrameSize();
}
