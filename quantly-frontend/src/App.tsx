import React, { useState } from "react";
import StockChart from "./components/StockChart";

function App() {
  const [ticker, setTicker] = useState<string>("AAPL");

  const handleSearch = (e: React.ChangeEvent<HTMLInputElement>) => {
    setTicker(e.target.value.toUpperCase());
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>주식 차트</h1>
      <input 
        type="text" 
        placeholder="종목 검색 (예: AAPL)"
        onChange={handleSearch}
        style={{ padding: "10px", width: "300px" }}
      />
      <div style={{ marginTop: "20px" }}>
        <StockChart ticker={ticker} />
      </div>
    </div>
  );
}

export default App;

