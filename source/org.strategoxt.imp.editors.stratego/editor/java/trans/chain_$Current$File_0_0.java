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

@SuppressWarnings("all") public class chain_$Current$File_0_0 extends Strategy 
{ 
  public static chain_$Current$File_0_0 instance = new chain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentFile_0_0");
    Fail21940:
    { 
      IStrategoTerm y_4281 = null;
      IStrategoTerm a_4282 = null;
      a_4282 = term;
      Success11874:
      { 
        Fail21941:
        { 
          IStrategoTerm b_4282 = null;
          IStrategoTerm d_4282 = null;
          IStrategoTerm e_4282 = null;
          d_4282 = term;
          b_4282 = trans.const4263;
          e_4282 = d_4282;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4282, b_4282, trans.constCons1966);
          if(term == null)
            break Fail21941;
          if(true)
            break Success11874;
        }
        term = trans.constNil3;
      }
      y_4281 = term;
      term = a_4282;
      term = termFactory.makeTuple(y_4281, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6708.instance);
      if(term == null)
        break Fail21940;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}