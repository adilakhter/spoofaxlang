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

@SuppressWarnings("all") public class bigchain_$Source$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Source$Dir_0_0 instance = new bigchain_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_SourceDir_0_0");
    Fail21990:
    { 
      IStrategoTerm x_4289 = null;
      IStrategoTerm z_4289 = null;
      z_4289 = term;
      Success11887:
      { 
        Fail21991:
        { 
          IStrategoTerm a_4290 = null;
          IStrategoTerm c_4290 = null;
          IStrategoTerm d_4290 = null;
          c_4290 = term;
          a_4290 = trans.const4342;
          d_4290 = c_4290;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4290, a_4290, trans.constCons1966);
          if(term == null)
            break Fail21991;
          if(true)
            break Success11887;
        }
        term = trans.constNil3;
      }
      x_4289 = term;
      term = z_4289;
      term = termFactory.makeTuple(x_4289, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6725.instance);
      if(term == null)
        break Fail21990;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}