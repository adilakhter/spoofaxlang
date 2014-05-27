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

@SuppressWarnings("all") public class bigbagof_$No$Analysis_0_0 extends Strategy 
{ 
  public static bigbagof_$No$Analysis_0_0 instance = new bigbagof_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_NoAnalysis_0_0");
    Fail22072:
    { 
      TermReference h_4304 = new TermReference();
      TermReference i_4304 = new TermReference();
      if(i_4304.value == null)
        i_4304.value = term;
      else
        if(i_4304.value != term && !i_4304.value.match(term))
          break Fail22072;
      if(h_4304.value == null)
        h_4304.value = term;
      else
        if(h_4304.value != term && !h_4304.value.match(term))
          break Fail22072;
      Success11910:
      { 
        Fail22073:
        { 
          IStrategoTerm l_4304 = null;
          IStrategoTerm n_4304 = null;
          IStrategoTerm o_4304 = null;
          n_4304 = term;
          l_4304 = trans.const4349;
          o_4304 = n_4304;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4304, l_4304, trans.constCons1966);
          if(term == null)
            break Fail22073;
          if(true)
            break Success11910;
        }
        term = trans.constNil3;
      }
      lifted6754 lifted67540 = new lifted6754();
      lifted67540.h_4304 = h_4304;
      lifted67540.i_4304 = i_4304;
      term = filter_1_0.instance.invoke(context, term, lifted67540);
      if(term == null)
        break Fail22072;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}