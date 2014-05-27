package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_stratego__sugar_stream_0_0 extends Strategy 
{ 
  public static parse_stratego__sugar_stream_0_0 instance = new parse_stratego__sugar_stream_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_stratego__sugar_stream_0_0");
    Fail21430:
    { 
      IStrategoTerm n_4197 = null;
      IStrategoTerm o_4197 = null;
      n_4197 = term;
      o_4197 = trans.constStrategoSugarTbl1;
      term = parse_stream_1_1.instance.invoke(context, n_4197, strsglr_report_parse_error_0_0.instance, o_4197);
      if(term == null)
        break Fail21430;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}