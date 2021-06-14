function onSubmit() {
    let startDate = document.getElementById("contractDate").value;
    let date = startDate.split("-")
    let year = date[0];
    let month = date[1];
    let day = date [2];
    let today = new Date();

    let endDate = document.getElementById("contractEndDate").value;
    let dateEnd = endDate.split("-")
    let endYear = dateEnd[0];
    let endMonth = dateEnd[1];
    let endDay = dateEnd [2];

    if (year == today.getFullYear()) {
        if (month == (today.getMonth() + 1)) {
            if (day < today.getDate()) {
                return false;
            }
        }
        if (month < (today.getMonth() + 1)) {
            return false;
        }
    }
    if (year < today.getFullYear()) {
        return false;
    }

    if (year == endYear) {
        if (month == endMonth) {
            if (day >= endDay) {
                return false;
            }
        }
        if (month > endMonth){
            return false;
        }
    }
    if (year > endYear){
        return false;
    }
    return true;
}

function validateStartDate() {
    let startDate = document.getElementById("contractDate").value;
    let date = startDate.split("-")
    let year = date[0];
    let month = date[1];
    let day = date [2];
    let today = new Date();

    if (year == today.getFullYear()) {
        if (month == (today.getMonth() + 1)) {
            if (day < today.getDate()) {
                document.getElementById("msgStartDate").innerText = "The start date must be greater than or equal to this current."
            }
        }
        if (month < (today.getMonth() + 1)) {
            document.getElementById("msgStartDate").innerText = "The start date must be greater than or equal to this current."
        }
    } else if (year < today.getFullYear()) {
        document.getElementById("msgStartDate").innerText = "The start date must be greater than or equal to this current."
    }
}

function validateEndDate() {
    let startDate = document.getElementById("contractDate").value;
    let dateStart = startDate.split("-")
    let startYear = dateStart[0];
    let startMonth = dateStart[1];
    let startDay = dateStart [2];

    let endDate = document.getElementById("contractEndDate").value;
    let dateEnd = endDate.split("-")
    let endYear = dateEnd[0];
    let endMonth = dateEnd[1];
    let endDay = dateEnd [2];

    if (startYear == endYear) {
        if (startMonth == endMonth) {
            if (startDay >= endDay) {
                document.getElementById("msgEndDate").innerText = "The end date must be greater than the start date."
            }
        }
        if (startMonth > endMonth){
            document.getElementById("msgEndDate").innerText = "The end date must be greater than the start date."
        }
    }else if (startYear > endYear){
        document.getElementById("msgEndDate").innerText = "The end date must be greater than the start date."
    }
}