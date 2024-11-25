package co.imp.tech.service;

import co.imp.tech.dto.MonitorResponseDto;
import co.imp.tech.utils.GenericMapperUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ComsumeClientService {
    private final AddressClientService addressClientService;

    public MonitorResponseDto monitorRequest(int size, int page){
        log.info("monitorRequest : {}", addressClientService.requestMonitor(size, page));
        return GenericMapperUtil.toDto(addressClientService.requestMonitor(size, page), MonitorResponseDto.class);
    }
}
