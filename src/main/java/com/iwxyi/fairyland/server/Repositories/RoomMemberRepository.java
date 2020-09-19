package com.iwxyi.fairyland.server.Repositories;

import java.util.List;

import javax.transaction.Transactional;

import com.iwxyi.fairyland.server.Models.RoomMember;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RoomMemberRepository extends CrudRepository<RoomMember, Long> {
    List<RoomMember> findByRoomId(Long roomId);

    List<RoomMember> findByUserId(Long userId);

    RoomMember findByRoomIdAndUserId(Long roomId, Long userId);
    
    @Modifying
    @Transactional
    @Query("update RoomMember rm set rm.integral = rm.integral + :add where rm.userId = :userId")
    void increaseRoomMemberIntegral(@Param("userId") Long userId, @Param("add") int add);

}