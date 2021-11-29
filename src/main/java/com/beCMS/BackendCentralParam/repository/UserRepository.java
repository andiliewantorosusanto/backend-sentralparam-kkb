package com.beCMS.BackendCentralParam.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import com.beCMS.BackendCentralParam.model.userlogin.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findBynip(String nip);

    Optional<User> findById(Long id);
    
    User findByFirstName(String name);

    @Query("SELECT id from User u where nip =?1")
    Long findIdBynip(String nip);

    @Transactional
    @Modifying
    @Query("update User set fcmToken = ?1 where id = ?2")
    Integer updateFcm(String fcmToken, Long id);

    @Transactional
    @Modifying
    @Query("update User set fcmToken = ?1, lastUpdateFcm = ?2 where id = ?3")
    Integer updateFcm(String fcmToken, String lastUpdateToken, Long id);

    // @Query("select c.NIK from User a left join Showroom b on a.id = b.idShowroom left join Customer c on b.idKonsumen = c.customerid where a.nip =?1")
    // String cekNIK(String nip);

    // @Query(value= "Update penggunaan set jumlah_pengajuan =jumlahPengajuan where id_pengajuan = idPengajuan", nativeQuery = true)
    // List<Penggunaan> updatePenggunaan(Integer idPengajuan,Double jumlahPenggunaan);

    @Transactional
    @Modifying
    @Query("update User set counter = counter + 1 where nip = ?1")
    Integer simpanCounter(String nip);

    @Transactional
    @Modifying
    @Query("update User set login =?1, expired=?2 where nip = ?3")
    Integer simpanExpired(String login, String expired, String nip);

    @Transactional
    @Modifying
    @Query("update User set status = 1 where nip = ?1")
    Integer simpanCounterLogin(String nip);

    @Transactional
    @Modifying
    @Query("update User set log = 1 where nip = ?1")
    Integer simpanLogLogin(String nip);

    @Transactional
    @Modifying
    @Query("update User set status = 0 where nip = ?1")
    Integer resetLogin(String nip);

    @Query("SELECT counter FROM User u where nip =?1")
    Integer countCounter(String nip);

    @Query("SELECT status FROM User u where nip =?1")
    Integer cekLogin(String nip);

    @Query(value= "select c.name from user_account_cms a left join users_roles_cms b on a.id = b.user_id left join role_cms c on b.role_id = c.id where a.nip = ?1",nativeQuery = true)
    String cekRoles(String nip);

    @Query("SELECT expired FROM User u where nip =?1")
    String cekLoginExpired(String nip);

    @Query("SELECT count(*) FROM User u where nip =?1")
    String cekUsername(String nip);

    @Query("SELECT status FROM User u where nip =?1")
    Integer cekUser(String nip);
    
    @Transactional
    @Modifying
    @Query("update User set status = 0 where nip = ?1")
    Integer updateLogout(String nip);

}