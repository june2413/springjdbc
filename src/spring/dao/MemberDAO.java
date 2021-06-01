package june.spring.dao;

import java.util.List;

import june.spring.vo.Member;


public interface MemberDAO {
	
	void insertMember(Member mb);
	List<Member> selectAllMember();

	Member selectOneMember(int mno);

	void updateMember(Member m);

	void deleteMember(int mno);





	
}
