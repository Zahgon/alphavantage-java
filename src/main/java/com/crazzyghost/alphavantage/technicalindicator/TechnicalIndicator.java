/*
 *
 * Copyright (c) 2020 Sylvester Sefa-Yeboah
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.crazzyghost.alphavantage.technicalindicator;

import com.crazzyghost.alphavantage.AlphaVantageException;
import com.crazzyghost.alphavantage.Config;
import com.crazzyghost.alphavantage.Fetcher;
import com.crazzyghost.alphavantage.UrlExtractor;
import com.crazzyghost.alphavantage.parameters.*;
import com.crazzyghost.alphavantage.parser.Parser;
import com.crazzyghost.alphavantage.technicalindicator.request.*;
import com.crazzyghost.alphavantage.technicalindicator.response.*;
import com.crazzyghost.alphavantage.technicalindicator.response.ad.ADResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.adosc.ADOSCResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.adx.ADXResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.adxr.ADXRResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.apo.APOResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.aroon.AROONResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.aroonosc.AROONOSCResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.atr.ATRResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.bbands.BBANDSResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.bop.BOPResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.cci.CCIResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.cmo.CMOResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.dema.DEMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.dx.DXResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.ema.EMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.htdcperiod.HTDCPERIODResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.htdcphase.HTDCPHASEResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.htphasor.HTPHASORResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.htsine.HTSINEResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.httrendline.HTTRENDLINEResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.httrendmode.HTTRENDMODEResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.kama.KAMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.macd.MACDEXTResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.macd.MACDResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.mama.MAMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.mfi.MFIResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.midpoint.MIDPOINTResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.midprice.MIDPRICEResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.minusdi.MINUSDIResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.minusdm.MINUSDMResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.mom.MOMResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.natr.NATRResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.obv.OBVResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.plusdi.PLUSDIResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.plusdm.PLUSDMResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.ppo.PPOResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.roc.ROCResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.rocr.ROCRResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.rsi.RSIResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.sar.SARResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.sma.SMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.stoch.STOCHResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.stochf.STOCHFResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.stochrsi.STOCHRSIResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.t3.T3Response;
import com.crazzyghost.alphavantage.technicalindicator.response.tema.TEMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.trange.TRANGEResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.trima.TRIMAResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.trix.TRIXResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.ultosc.ULTOSCResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.vwap.VWAPResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.willr.WILLRResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.wma.WMAResponse;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/**
 * Access to Technical TechnicalIndicator Data
 *
 * @author crazzyghost
 * @since 1.1.0
 */
public final class TechnicalIndicator implements Fetcher {

    private TechnicalIndicatorRequest.Builder<?> builder;

    private Fetcher.SuccessCallback<?> successCallback;

    private Fetcher.FailureCallback failureCallback;

    private final Config config;

    public TechnicalIndicator(Config config) {
        this.config = config;
    }

    /**
     * Fetch Technical TechnicalIndicator Data
     */
    @Override
    public void fetch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Make a blocking synchronous http request to fetch the data.
     * This will be called by the
     * {@link SimpleTechnicalIndicatorRequestProxy#fetchSync()}.
     * <p>
     * On Android this will throw NetworkOnMainThreadException. In that case you
     * should handle this on
     * another thread
     * </p>
     *
     * <p>
     * Using this method will overwrite any async callback
     * </p>
     *
     * @since 1.4.1
     * @param successCallback internally used {@link SuccessCallback}
     * @throws AlphaVantageException exception thrown
     */
    private void fetchSync(SuccessCallback<?> successCallback) throws AlphaVantageException {
        Config.checkNotNullOrKeyEmpty(config);
        this.successCallback = successCallback;
        this.failureCallback = null;
        okhttp3.OkHttpClient client = config.getOkHttpClient();
        try (Response response = client.newCall(UrlExtractor.extract(builder.build(), config.getKey())).execute()) {
            parseTechnicalIndicatorResponse(Parser.parseJSON(response.body().string()));
        } catch (IOException e) {
            throw new AlphaVantageException(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void parsePeriodicSeriesResponse(Map<String, Object> data) {
        PeriodicSeriesResponse response = null;
        switch(builder.function) {
            case SMA:
                response = SMAResponse.of(data);
                break;
            case EMA:
                response = EMAResponse.of(data);
                break;
            case WMA:
                response = WMAResponse.of(data);
                break;
            case DEMA:
                response = DEMAResponse.of(data);
                break;
            case TEMA:
                response = TEMAResponse.of(data);
                break;
            case TRIMA:
                response = TRIMAResponse.of(data);
                break;
            case KAMA:
                response = KAMAResponse.of(data);
                break;
            case T3:
                response = T3Response.of(data);
                break;
            case RSI:
                response = RSIResponse.of(data);
                break;
            case MOM:
                response = MOMResponse.of(data);
                break;
            case CMO:
                response = CMOResponse.of(data);
                break;
            case ROC:
                response = ROCResponse.of(data);
                break;
            case ROCR:
                response = ROCRResponse.of(data);
                break;
            case TRIX:
                response = TRIXResponse.of(data);
                break;
            case MIDPOINT:
                response = MIDPOINTResponse.of(data);
            default:
                break;
        }
        if (Objects.nonNull(response) && Objects.nonNull(response.getErrorMessage())) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((SuccessCallback<PeriodicSeriesResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseMAMAResponse(Map<String, Object> data) {
        MAMAResponse response = MAMAResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<MAMAResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseSimpleTechnicalIndicatorResponse(Map<String, Object> data) {
        SimpleTechnicalIndicatorResponse response = null;
        switch(builder.function) {
            case VWAP:
                response = VWAPResponse.of(data);
                break;
            case BOP:
                response = BOPResponse.of(data);
                break;
            case TRANGE:
                response = TRANGEResponse.of(data);
                break;
            case AD:
                response = ADResponse.of(data);
                break;
            case OBV:
                response = OBVResponse.of(data);
            default:
                break;
        }
        if (Objects.nonNull(response) && Objects.nonNull(response.getErrorMessage())) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((SuccessCallback<SimpleTechnicalIndicatorResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseMACDResponse(Map<String, Object> data) {
        MACDResponse response = MACDResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<MACDResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseMACDEXTResponse(Map<String, Object> data) {
        MACDEXTResponse response = MACDEXTResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<MACDEXTResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseSTOCHResponse(Map<String, Object> data) {
        STOCHResponse response = STOCHResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<STOCHResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseSTOCHFResponse(Map<String, Object> data) {
        STOCHFResponse response = STOCHFResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<STOCHFResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseSTOCHRSIResponse(Map<String, Object> data) {
        STOCHRSIResponse response = STOCHRSIResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<STOCHRSIResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parsePriceOscillatorResponse(Map<String, Object> data) {
        PriceOscillatorResponse response = null;
        switch(builder.function) {
            case APO:
                response = APOResponse.of(data);
                break;
            case PPO:
                response = PPOResponse.of(data);
            default:
                break;
        }
        if (Objects.nonNull(response) && Objects.nonNull(response.getErrorMessage())) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<PriceOscillatorResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parsePeriodicResponse(Map<String, Object> data) {
        PeriodicResponse response = null;
        switch(builder.function) {
            case WILLR:
                response = WILLRResponse.of(data);
                break;
            case ADX:
                response = ADXResponse.of(data);
                break;
            case ADXR:
                response = ADXRResponse.of(data);
                break;
            case CCI:
                response = CCIResponse.of(data);
                break;
            case AROONOSC:
                response = AROONOSCResponse.of(data);
                break;
            case MFI:
                response = MFIResponse.of(data);
                break;
            case DX:
                response = DXResponse.of(data);
                break;
            case MINUS_DI:
                response = MINUSDIResponse.of(data);
                break;
            case PLUS_DI:
                response = PLUSDIResponse.of(data);
                break;
            case MINUS_DM:
                response = MINUSDMResponse.of(data);
                break;
            case PLUS_DM:
                response = PLUSDMResponse.of(data);
                break;
            case MIDPRICE:
                response = MIDPRICEResponse.of(data);
                break;
            case ATR:
                response = ATRResponse.of(data);
                break;
            case NATR:
                response = NATRResponse.of(data);
            default:
                break;
        }
        if (Objects.nonNull(response) && Objects.nonNull(response.getErrorMessage())) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<PeriodicResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseAROONResponse(Map<String, Object> data) {
        AROONResponse response = AROONResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<AROONResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseULTOSCResponse(Map<String, Object> data) {
        ULTOSCResponse response = ULTOSCResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<ULTOSCResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseBBANDSResponse(Map<String, Object> data) {
        BBANDSResponse response = BBANDSResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<BBANDSResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseSARResponse(Map<String, Object> data) {
        SARResponse response = SARResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<SARResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseADOSCResponse(Map<String, Object> data) {
        ADOSCResponse response = ADOSCResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<ADOSCResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseSeriesResponse(Map<String, Object> data) {
        SeriesResponse response = null;
        switch(builder.function) {
            case HT_TRENDLINE:
                response = HTTRENDLINEResponse.of(data);
                break;
            case HT_TRENDMODE:
                response = HTTRENDMODEResponse.of(data);
                break;
            case HT_DCPERIOD:
                response = HTDCPERIODResponse.of(data);
                break;
            case HT_DCPHASE:
                response = HTDCPHASEResponse.of(data);
            default:
                break;
        }
        if (Objects.nonNull(response) && Objects.nonNull(response.getErrorMessage())) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((SuccessCallback<SeriesResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseHTSINEResponse(Map<String, Object> data) {
        HTSINEResponse response = HTSINEResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<HTSINEResponse>) successCallback).onSuccess(response);
        }
    }

    @SuppressWarnings("unchecked")
    private void parseHTPHASORResponse(Map<String, Object> data) {
        HTPHASORResponse response = HTPHASORResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null)
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<HTPHASORResponse>) successCallback).onSuccess(response);
        }
    }

    private void parseTechnicalIndicatorResponse(Map<String, Object> data) {
        switch(builder.function) {
            case SMA:
            case EMA:
            case WMA:
            case DEMA:
            case TEMA:
            case TRIMA:
            case KAMA:
            case T3:
            case RSI:
            case MOM:
            case CMO:
            case ROC:
            case ROCR:
            case TRIX:
            case MIDPOINT:
                parsePeriodicSeriesResponse(data);
                break;
            case MAMA:
                parseMAMAResponse(data);
                break;
            case VWAP:
            case BOP:
            case TRANGE:
            case AD:
            case OBV:
                parseSimpleTechnicalIndicatorResponse(data);
                break;
            case MACD:
                parseMACDResponse(data);
                break;
            case MACDEXT:
                parseMACDEXTResponse(data);
                break;
            case STOCH:
                parseSTOCHResponse(data);
                break;
            case STOCHF:
                parseSTOCHFResponse(data);
                break;
            case STOCHRSI:
                parseSTOCHRSIResponse(data);
                break;
            case APO:
            case PPO:
                parsePriceOscillatorResponse(data);
                break;
            case WILLR:
            case ADX:
            case ADXR:
            case CCI:
            case AROONOSC:
            case MFI:
            case DX:
            case MINUS_DI:
            case PLUS_DI:
            case MINUS_DM:
            case PLUS_DM:
            case MIDPRICE:
            case ATR:
            case NATR:
                parsePeriodicResponse(data);
                break;
            case AROON:
                parseAROONResponse(data);
                break;
            case ULTOSC:
                parseULTOSCResponse(data);
                break;
            case BBANDS:
                parseBBANDSResponse(data);
                break;
            case SAR:
                parseSARResponse(data);
                break;
            case ADOSC:
                parseADOSCResponse(data);
                break;
            case HT_TRENDLINE:
            case HT_TRENDMODE:
            case HT_DCPERIOD:
            case HT_DCPHASE:
                parseSeriesResponse(data);
                break;
            case HT_SINE:
                parseHTSINEResponse(data);
                break;
            case HT_PHASOR:
                parseHTPHASORResponse(data);
                break;
            default:
                break;
        }
    }

    public PeriodicSeriesRequestProxy<SMAResponse> sma() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<EMAResponse> ema() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<WMAResponse> wma() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<DEMAResponse> dema() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<TEMAResponse> tema() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<TRIMAResponse> trima() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<KAMAResponse> kama() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MAMARequestProxy mama() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<T3Response> t3() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleTechnicalIndicatorRequestProxy<?, VWAPResponse> vwap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MACDRequestProxy macd() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MACDEXTRequestProxy macdext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public STOCHRequestProxy stoch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public STOCHFRequestProxy stochf() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<RSIResponse> rsi() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public STOCHRSIRequestProxy stochrsi() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<WILLRResponse> willr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<ADXResponse> adx() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<ADXRResponse> adxr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PriceOscillatorRequestProxy<APOResponse> apo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PriceOscillatorRequestProxy<PPOResponse> ppo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<MOMResponse> mom() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleTechnicalIndicatorRequestProxy<?, BOPResponse> bop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<CCIResponse> cci() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<CMOResponse> cmo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<ROCResponse> roc() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<ROCRResponse> rocr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<AROONResponse> aroon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<AROONOSCResponse> aroonosc() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<MFIResponse> mfi() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<TRIXResponse> trix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ULTOSCRequestProxy ultosc() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<DXResponse> dx() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<MINUSDIResponse> minusdi() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<PLUSDIResponse> plusdi() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<MINUSDMResponse> minusdm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<PLUSDMResponse> plusdm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BBANDSRequestProxy bbands() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicSeriesRequestProxy<MIDPOINTResponse> midpoint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<MIDPRICEResponse> midprice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SARRequestProxy sar() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleTechnicalIndicatorRequestProxy<?, TRANGEResponse> trange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<ATRResponse> atr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PeriodicRequestProxy<NATRResponse> natr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleTechnicalIndicatorRequestProxy<?, ADResponse> ad() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ADOSCRequestProxy adosc() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleTechnicalIndicatorRequestProxy<?, OBVResponse> obv() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SeriesRequestProxy<HTTRENDLINEResponse> httrendline() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SeriesRequestProxy<HTSINEResponse> htsine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SeriesRequestProxy<HTTRENDMODEResponse> httrendmode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SeriesRequestProxy<HTDCPHASEResponse> htdcphase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SeriesRequestProxy<HTDCPERIODResponse> htdcperiod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SeriesRequestProxy<HTPHASORResponse> htphasor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * An base proxy for building requests. Adds the functionality of adding
     * callbacks and a terminal method for
     * fetching data.
     *
     * @param <T> A Concrete {@link SimpleTechnicalIndicatorRequestProxy}
     *            Implementation
     */
    @SuppressWarnings("unchecked")
    public class SimpleTechnicalIndicatorRequestProxy<T extends SimpleTechnicalIndicatorRequestProxy<?, U>, U> {

        protected TechnicalIndicatorRequest.Builder<?> builder;

        protected U syncResponse;

        public SimpleTechnicalIndicatorRequestProxy() {
        }

        public SimpleTechnicalIndicatorRequestProxy(Function function) {
            builder = new SimpleTechnicalIndicatorRequest.Builder();
            builder = builder.function(function);
        }

        public T dataType(DataType dataType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T forSymbol(String symbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T interval(Interval interval) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T onSuccess(Fetcher.SuccessCallback<?> callback) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T onFailure(Fetcher.FailureCallback callback) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void fetch() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the response during a synchronous call
         *
         * @param response
         */
        private void setSyncResponse(U response) {
            this.syncResponse = response;
        }

        /**
         * Set the right builder and make a synchronous request using
         * {@link TechnicalIndicator#fetch()}
         * <p>
         * When calling this method, any async callbacks will be overwritten
         * </p>
         *
         * @return The api response
         * @throws AlphaVantageException
         */
        public U fetchSync() throws AlphaVantageException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class PeriodicSeriesRequestProxy<T> extends SimpleTechnicalIndicatorRequestProxy<PeriodicSeriesRequestProxy<T>, T> {

        public PeriodicSeriesRequestProxy(Function function) {
            builder = new PeriodicSeriesRequest.Builder();
            builder = builder.function(function);
        }

        public PeriodicSeriesRequestProxy<T> timePeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public PeriodicSeriesRequestProxy<T> seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class PeriodicRequestProxy<T> extends SimpleTechnicalIndicatorRequestProxy<PeriodicRequestProxy<T>, T> {

        public PeriodicRequestProxy(Function function) {
            builder = new PeriodicRequest.Builder();
            builder = builder.function(function);
        }

        public PeriodicRequestProxy<T> timePeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class SeriesRequestProxy<T> extends SimpleTechnicalIndicatorRequestProxy<SeriesRequestProxy<T>, T> {

        public SeriesRequestProxy(Function function) {
            builder = new SeriesRequest.Builder();
            builder = builder.function(function);
        }

        public SeriesRequestProxy<T> seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class MAMARequestProxy extends SimpleTechnicalIndicatorRequestProxy<MAMARequestProxy, MAMAResponse> {

        public MAMARequestProxy() {
            builder = new MAMARequest.Builder();
        }

        public MAMARequestProxy fastLimit(double fastLimit) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MAMARequestProxy seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MAMARequestProxy slowLimit(double slowLimit) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class MACDRequestProxy extends SimpleTechnicalIndicatorRequestProxy<MACDRequestProxy, MACDResponse> {

        public MACDRequestProxy() {
            builder = new MACDRequest.Builder();
        }

        public MACDRequestProxy fastPeriod(int fastLimit) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDRequestProxy slowPeriod(int slowPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDRequestProxy signalPeriod(int signalPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDRequestProxy seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class MACDEXTRequestProxy extends SimpleTechnicalIndicatorRequestProxy<MACDEXTRequestProxy, MACDEXTResponse> {

        public MACDEXTRequestProxy() {
            builder = new MACDEXTRequest.Builder();
        }

        public MACDEXTRequestProxy fastPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDEXTRequestProxy slowPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDEXTRequestProxy signalPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDEXTRequestProxy fastMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDEXTRequestProxy slowMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDEXTRequestProxy signalMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MACDEXTRequestProxy seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class STOCHRequestProxy extends SimpleTechnicalIndicatorRequestProxy<STOCHRequestProxy, STOCHResponse> {

        public STOCHRequestProxy() {
            builder = new STOCHRequest.Builder();
        }

        public STOCHRequestProxy fastKPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRequestProxy slowKPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRequestProxy slowDPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRequestProxy slowKMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRequestProxy slowDMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class STOCHFRequestProxy extends SimpleTechnicalIndicatorRequestProxy<STOCHFRequestProxy, STOCHFResponse> {

        public STOCHFRequestProxy() {
            builder = new STOCHFRequest.Builder();
        }

        public STOCHFRequestProxy fastKPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHFRequestProxy fastDPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHFRequestProxy fastDMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class STOCHRSIRequestProxy extends SimpleTechnicalIndicatorRequestProxy<STOCHRSIRequestProxy, STOCHRSIResponse> {

        public STOCHRSIRequestProxy() {
            builder = new STOCHRSIRequest.Builder();
        }

        public STOCHRSIRequestProxy fastKPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRSIRequestProxy fastDPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRSIRequestProxy fastDMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRSIRequestProxy timePeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public STOCHRSIRequestProxy seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class PriceOscillatorRequestProxy<T> extends SimpleTechnicalIndicatorRequestProxy<PriceOscillatorRequestProxy<T>, T> {

        public PriceOscillatorRequestProxy(Function function) {
            builder = new PriceOscillatorRequest.Builder();
            builder = builder.function(function);
        }

        public PriceOscillatorRequestProxy<T> fastPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public PriceOscillatorRequestProxy<T> slowPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public PriceOscillatorRequestProxy<T> seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public PriceOscillatorRequestProxy<T> maType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class ULTOSCRequestProxy extends SimpleTechnicalIndicatorRequestProxy<ULTOSCRequestProxy, ULTOSCResponse> {

        public ULTOSCRequestProxy() {
            builder = new ULTOSCRequest.Builder();
        }

        public ULTOSCRequestProxy timePeriod1(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ULTOSCRequestProxy timePeriod2(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ULTOSCRequestProxy timePeriod3(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class BBANDSRequestProxy extends SimpleTechnicalIndicatorRequestProxy<BBANDSRequestProxy, BBANDSResponse> {

        public BBANDSRequestProxy() {
            builder = new BBANDSRequest.Builder();
        }

        public BBANDSRequestProxy nbdevup(int dev) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public BBANDSRequestProxy nbdevdn(int dev) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public BBANDSRequestProxy maType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public BBANDSRequestProxy timePeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public BBANDSRequestProxy seriesType(SeriesType series) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class SARRequestProxy extends SimpleTechnicalIndicatorRequestProxy<SARRequestProxy, SARResponse> {

        public SARRequestProxy() {
            builder = new SARRequest.Builder();
        }

        public SARRequestProxy acceleration(double acceleration) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SARRequestProxy maximum(double maximum) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public class ADOSCRequestProxy extends SimpleTechnicalIndicatorRequestProxy<ADOSCRequestProxy, ADOSCResponse> {

        public ADOSCRequestProxy() {
            builder = new ADOSCRequest.Builder();
        }

        public ADOSCRequestProxy fastPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ADOSCRequestProxy slowPeriod(int period) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
