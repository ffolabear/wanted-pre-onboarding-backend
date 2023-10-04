package com.wanted.preonboarding.recruit;

import com.wanted.preonboarding.common.CommonResponse;
import com.wanted.preonboarding.recruit.dto.RecruitRegisterDto;
import com.wanted.preonboarding.recruit.dto.RecruitSearchRequestDto;
import com.wanted.preonboarding.recruit.dto.RecruitUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//채용공고 컨트롤러
@RequiredArgsConstructor
@RestController("/recruitment")
public class RecruitController {

    private final RecruitService recruitService;

    //요구사항 1번 - 채용공고 등록
    @PostMapping
    public void postRecruitment(RecruitRegisterDto recruitRegisterDto) {
        recruitService.addRecruitment(recruitRegisterDto);
    }

    //요구사항 2번 - 채용공고 수정
    @PutMapping("/{recruitmentId}")
    public ResponseEntity<CommonResponse> putRecruitment(RecruitUpdateDto recruitUpdateDto,
                                                         @PathVariable Long recruitmentId) {
        return null;
    }

    //요구사항 3번 - 채용공고 삭제
    @DeleteMapping("/{recruitmentId}")
    public ResponseEntity<CommonResponse> deleteRecruitment(@PathVariable Long recruitmentId) {
        return null;
    }

    //요구사항 4-1번 - 채용공고 목록 조회
    @GetMapping
    public ResponseEntity<CommonResponse> getRecruitment() {
        return null;
    }

    //요구사항 4-2번 - 채용공고 검색
    @GetMapping
    public ResponseEntity<CommonResponse> getSearchedRecruitment(RecruitSearchRequestDto recruitSearchRequestDto) {
        return null;
    }



}
