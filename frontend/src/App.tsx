import NavBar from 'componentes/NavBar';
import DataTable from 'componentes/DataTable';
import Footer from 'componentes/Footer'

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
