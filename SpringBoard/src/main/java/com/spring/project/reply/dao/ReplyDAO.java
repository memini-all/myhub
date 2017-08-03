package com.spring.project.reply.dao;

import java.util.List;
import java.util.Map;

import com.spring.project.reply.dto.ReplyVO;

/**
 * ReplyDAO interface
 * @author adm
 *
 */
public interface ReplyDAO {

	
	/**
	 * 게시물에 있는 댓글 목록을 가져온다.
	 * 
	 * @param paramMap 글 번호와 페이지 정보를 담고있는 Map
	 * 
	 * @return 댓글 List
	 * @throws Exception
	 */
	public List<ReplyVO> selectReplyList(Map<String, Object> paramMap) throws Exception;
	
	
	
	/**
	 * 댓글을 등록한다.
	 * 
	 * @param replyVO {@link ReplyVO} 댓글 정보를 담고있는 VO
	 * 
	 * @return int 등록한 댓글번호
	 * @throws Exception
	 */
	public int insertReply(ReplyVO replyVO) throws Exception;
	
	
	
	/**
	 * 댓글 그룹번호를 수정한다.
	 * 
	 * @param repno 댓글 번호
	 * @throws Exception
	 */
	public void updateReplyGroup(Integer repno) throws Exception;
	
	
	
	/**
	 * 댓글을 수정한다.
	 * 
	 * @param replyVO {@link ReplyVO} 댓글 정보를 담고있는 VO
	 * @throws Exception
	 */
	public void updateReply(ReplyVO replyVO) throws Exception;
	
	
	
	/**
	 * 댓글을 삭제한다.
	 * 
	 * @param repno 댓글번호
	 * @throws Exception
	 */
	public void deleteReply(Integer repno) throws Exception;

	
	
	/**
	 * 게시글에 있는 댓글의 총 수를 구한다.
	 * 
	 * @param brdno 글번호
	 * 
	 * @return int 댓글 수
	 * @throws Exception
	 */
	public int replyCount(Integer brdno) throws Exception;
	
	
	
	/**
	 * 댓글에 답글(Child 자식)이 있는지 체크한다.
	 * 
	 * @param repno 댓글번호
	 * 
	 * @return int 답글(Child)의 수
	 * @throws Exception
	 */
	public int checkReplyChild(Integer repno) throws Exception;
	
	
	
	/**
	 * 내가 쓴 댓글의 총 개수를 구한다.
	 * 
	 * @param userno 사용자 번호
	 * 
	 * @return int 내가쓴 댓글의 수
	 * @throws Exception
	 */
	public int selectUserReplyCnt(int userno) throws Exception;
	
	
	
	/**
	 * 내가 쓴 댓글을 조회한다.
	 * 
	 * @param paramMap 사용자 정보와 페이지 정보를 담고있는 Map
	 * 
	 * @return 내가 쓴 댓글 List
	 * @throws Exception
	 */
	public List<ReplyVO> selectUserReplyList(Map<String, Object> paramMap) throws Exception;
	
	
	
	/**
	 * 내가 쓴 댓글을 삭제한다.
	 * 
	 * @param repnoList 삭제 할 댓글번호 List
	 * @throws Exception
	 */
	public void deleteUserReply(List<Integer> repnoList) throws Exception;

}


