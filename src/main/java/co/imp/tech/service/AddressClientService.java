package co.imp.tech.service;

import co.imp.tech.client.AddressClient;
import co.imp.tech.dto.MonitorResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressClientService {
    @Autowired
    private AddressClient addressClient;

    public Object requestMonitor(int size, int page) {
        ResponseEntity<MonitorResponseDto> addressResponse = (ResponseEntity<MonitorResponseDto>) addressClient.requestMonitor(size, page);
        return addressResponse.getBody();
    }
}
