function toggleNav() {
    const sidebar = document.getElementById('sidebar');
    const main = document.getElementById('main');
    const sideWidth = sidebar.style.width;

    if(sideWidth === "250px") {
        sidebar.style.width = "0";
        main.style.marginLeft = "0";
    } else {
        sidebar.style.width = "250px";
        main.style.marginLeft = "250px";
    }
}
