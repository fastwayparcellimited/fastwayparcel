package logistics.giaglobal.app.history;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends CrudRepository<History, Integer> {
	public List<History> findByShipmentShipmentId(String shipmentId);
}
