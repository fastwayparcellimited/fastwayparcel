package logistics.giaglobal.app.history;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoryController {
	@Autowired
	private HistoryService historyService;
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping(method = RequestMethod.POST, value = "/history")
	public History addHistory(@RequestBody History history) {
		return historyService.addHistory(history);
	}
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping(method = RequestMethod.PUT, value = "/history")
	public History updateHistory(@RequestBody History history) {
		return historyService.addHistory(history);
	}
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping("/shipment/{shipmentId}/histories/")
	public List<History> getHistoriesByShipment(@PathVariable String shipmentId) {
		return historyService.getHistoriesByShipment(shipmentId);
	}
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping("/history/{historyId}")
	public Optional<History> getHistory(@PathVariable int historyId) {
		return historyService.getHistory(historyId);
	}
	
	@RequestMapping("/history/{historyId}/delete")
	public void deleteHistory(@PathVariable int historyId) {
		historyService.deleteHistory(historyId);
	}

}
