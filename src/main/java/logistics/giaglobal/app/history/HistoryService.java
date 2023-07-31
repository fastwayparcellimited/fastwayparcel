package logistics.giaglobal.app.history;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {
	
	@Autowired
	private HistoryRepository historyRepository;
	
	public History addHistory(History history) {
		return historyRepository.save(history);
	}
	
	public Optional<History> getHistory(int historyId) {
		return historyRepository.findById(historyId);
	}
	public List<History> getHistoriesByShipment(String shipmentId) {
		return historyRepository.findByShipmentShipmentId(shipmentId);
	}
	
	public void deleteHistory(int historyId) {
		historyRepository.deleteById(historyId);
	}

}
