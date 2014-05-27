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

@SuppressWarnings("all") public class extract_meta_expr_escapes_0_0 extends Strategy 
{ 
  public static extract_meta_expr_escapes_0_0 instance = new extract_meta_expr_escapes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("extract_meta_expr_escapes_0_0");
    Fail21527:
    { 
      IStrategoTerm e_4210 = null;
      IStrategoTerm f_4210 = null;
      IStrategoTerm k_4210 = null;
      e_4210 = term;
      k_4210 = term;
      IStrategoTerm term11630 = term;
      Success11561:
      { 
        Fail21528:
        { 
          term = collect_om_2_0.instance.invoke(context, e_4210, lifted6566.instance, conc_0_0.instance);
          if(term == null)
            break Fail21528;
          f_4210 = term;
          if(true)
            break Success11561;
        }
        term = term11630;
        IStrategoTerm i_4210 = null;
        IStrategoTerm j_4210 = null;
        IStrategoTerm m_4210 = null;
        i_4210 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21527;
        j_4210 = term;
        m_4210 = i_4210;
        term = report_with_failure_0_2.instance.invoke(context, m_4210, trans.const4340, j_4210);
        if(term == null)
          break Fail21527;
      }
      term = k_4210;
      if(f_4210 == null)
        break Fail21527;
      term = f_4210;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}