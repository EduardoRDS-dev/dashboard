import instagram from 'assets/img/instagram.png';
import facebook from 'assets/img/facebook.png';

function Footer() {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <a href="https://github.com/EduardoRDS-dev" target="_blank" rel="noreferrer">Eduardo Rodrigues Dos Santos</a></p>
                <p>
                    <a href="https://www.instagram.com/edu.c137/" target="_blank" rel="noreferrer">
                        <img src={instagram} alt="DevSuperior" width="48" />
                    </a>
                   
                    <a href="https://www.facebook.com/profile.php?id=100016793558781" target="_blank" rel="noreferrer">
                        <img src={facebook} alt="DevSuperior" width="48" />
                    </a>
                </p>
                <p className="text-light"><small><strong>Semana Spring React</strong><br /></small></p>
            </div>
        </footer>
    );
}
export default Footer;