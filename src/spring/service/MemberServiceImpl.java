package june.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import june.spring.dao.MemberDAO;

import june.spring.vo.Member;

@Service("msrv")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO mdao;
	


	@Override
	public void newMember() {
		Member m = new Member("xyz987","123abc","혜교","abc@xyz.com");
		
		mdao.insertMember(m);
		System.out.println("성적데이터 생성 완료!!");
	
	}
	
	@Override
	public void readAllMember() {
		StringBuffer sb = new StringBuffer();
		List<Member> mbs = mdao.selectAllMember();
		
		for (Member m: mbs) sb.append(m);
		System.out.println(sb);
		
		
	}
	@Override
	public void readOneMember(int mno) {
		Member m = mdao.selectOneMember(mno);
		System.out.println(m);
	}

	@Override
	public void modifyMember() {
		Member m = new Member("20",null,"123456","수지","xyz@abc.com", null);
		
		mdao.updateMember(m);
	}

	@Override
	public void removeMember() {
	mdao.deleteMember(20);
		
	}


}
