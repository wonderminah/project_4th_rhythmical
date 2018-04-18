package com.beatoven.rhythmical.interfaces;

import org.apache.ibatis.annotations.Mapper;
import com.beatoven.rhythmical.vo.Member;

/*마을 관련 인터페이스*/

@Mapper
public interface VillageInterface {

	// 설정된 모션 값 읽어오기
	public String readMotionList(Member member);
}
