package com.wanted.preonboarding.applicant;

import com.wanted.preonboarding.applicant.dto.ApplicantApplyingDto;
import com.wanted.preonboarding.common.CommonResponse;
import com.wanted.preonboarding.recruitment.dto.RecruitmentSearchRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/applicant")
public class ApplicantController {

    private final ApplicantService applicantService;

    @GetMapping
    public ResponseEntity<CommonResponse> getAllRecruitment() {
        return null;
    }

    //요구사항 4-2번 - 채용공고 검색
    @GetMapping("/search")
    public ResponseEntity<CommonResponse> getSearchedRecruitment(RecruitmentSearchRequestDto recruitSearchRequestDto) {
        return null;
    }

    //요구사항 5번 - 채용공고 상세내용 조회
    @GetMapping("/{recruitmentId}")
    public ResponseEntity<CommonResponse> getRecruitmentDetail(@PathVariable Long recruitmentId) {
        return null;
    }

    //요구사항 6번 - 채용공고 지원
    @PostMapping("/{recruitmentId}")
    public ResponseEntity<CommonResponse> postApplyingRecruitment(@PathVariable Long recruitmentId, ApplicantApplyingDto applicantApplyingDto) {
        return null;
    }

}
