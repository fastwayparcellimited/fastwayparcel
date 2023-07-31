getShipmentCount();

function getShipmentCount() {
    let shipmentXhr = new XMLHttpRequest();
    shipmentXhr.open("GET", "/shipments", true);
    shipmentXhr.send();

    shipmentXhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            setTimeout(function() {
                stopSpinner();
            }, 100)
        }
    }
}

function stopSpinner() {
    document.getElementById("spinner").style.display = "none";
    document.getElementById("content").style.display = "block";
}