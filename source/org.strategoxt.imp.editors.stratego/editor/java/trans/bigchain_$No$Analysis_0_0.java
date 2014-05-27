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

@SuppressWarnings("all") public class bigchain_$No$Analysis_0_0 extends Strategy 
{ 
  public static bigchain_$No$Analysis_0_0 instance = new bigchain_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_NoAnalysis_0_0");
    Fail23544:
    { 
      IStrategoTerm d_4857 = null;
      IStrategoTerm f_4857 = null;
      f_4857 = term;
      Success12617:
      { 
        Fail23545:
        { 
          IStrategoTerm g_4857 = null;
          IStrategoTerm i_4857 = null;
          IStrategoTerm j_4857 = null;
          i_4857 = term;
          g_4857 = trans.const4559;
          j_4857 = i_4857;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4857, g_4857, trans.constCons2047);
          if(term == null)
            break Fail23545;
          if(true)
            break Success12617;
        }
        term = trans.constNil4;
      }
      d_4857 = term;
      term = f_4857;
      term = termFactory.makeTuple(d_4857, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7023.instance);
      if(term == null)
        break Fail23544;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}