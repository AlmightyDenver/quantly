// src/components/StockChart.tsx
import React from "react";
import TradingViewWidget from "react-tradingview-widget";

interface StockChartProps {
  ticker: string;
}

const StockChart: React.FC<StockChartProps> = ({ ticker }) => {
  return (
    <TradingViewWidget
      symbol={ticker || "AAPL"}
      interval="1"
      timezone="Asia/Seoul"
      style="1"
      locale="en"
      autosize
    />
  );
};

export default StockChart;

