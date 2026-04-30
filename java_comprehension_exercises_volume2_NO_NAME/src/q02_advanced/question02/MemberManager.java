package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int id, String password) {
		for (Member member : members) {
			if (member.getId() == id) {
				member.setPassword(password);
				return;
			}
		}

		System.out.println("該当者はいませんでした。");
	}
}
