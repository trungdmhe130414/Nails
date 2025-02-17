package vn.mtpd.hd.tckt.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import vn.mtpd.hd.tckt.model.AssetTypeGroup;
import vn.mtpd.hd.tckt.repository.AssetTypeGroupRepository;

import java.util.ArrayList;
import java.util.List;
////
@Service
@RequiredArgsConstructor
@Slf4j
public class AssetTypeGroupService {
    private final AssetTypeGroupRepository assetTypeGroupRepository;

    @Bean
    private String test(){
        List<AssetTypeGroup> assetTypeGroups = assetTypeGroupRepository.findAll();
        log.info("[assetTypeGroups] : {}" , assetTypeGroups);
        return "abc";
    }

}
