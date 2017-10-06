const asideEstaVisivel = aside => aside.classList.contains("is-show");

function toggleAside() {
    const aside = document.querySelector(".js-o-aside");
    if (aside) {
        if (asideEstaVisivel(aside))
            hideAside(aside);
        else
            showAside(aside);
    }
}

function showAside(aside) {
    insertBackground();
    aside.classList.remove("is-hide");
    aside.classList.add("is-show");
    aside.style.display = "flex";
    document.body.style.gridTemplateColumns = "80% 0";
}

function hideAside() {
    const aside = document.querySelector(".js-o-aside");
    const background = document.querySelector(".js-l-menuBackground");
    if (aside && background) {
        aside.classList.remove("is-show");
        aside.classList.add("is-hide");
        aside.style.display = "none";
        document.body.style.gridTemplateColumns = "0 100%";
        background.remove();
    }
}

function insertBackground() {
    const background = document.createElement("div");
    background.classList.add("l-menuBackground", "js-l-menuBackground");
    background.addEventListener("click", hideAside);
    document.body.appendChild(background);
}