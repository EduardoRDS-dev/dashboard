import NavBar from 'componentes/NavBar';
import DataTable from 'componentes/DataTable';
import Footer from 'componentes/Footer'
import BarChart from 'componentes/BarChart';
import DonutChart from 'componentes/DonutChart';

function App() {
  return (
    <>
      <NavBar />
      <div className="container"> <h1 className="text-primary py-3">Dashboard de vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-secondary text-center">Taxa de sucesso (%)</h5>
            <BarChart/>
          </div>

          <div className="col-sm-6">
            <h5 className="text-secondary text-center">Todas as Vendas</h5>
            <DonutChart/>
          </div>
        </div>


        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
