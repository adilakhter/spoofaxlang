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

@SuppressWarnings("all") public class chain_$Current$Dir_0_0 extends Strategy 
{ 
  public static chain_$Current$Dir_0_0 instance = new chain_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentDir_0_0");
    Fail23572:
    { 
      IStrategoTerm c_4862 = null;
      IStrategoTerm e_4862 = null;
      e_4862 = term;
      Success12625:
      { 
        Fail23573:
        { 
          IStrategoTerm f_4862 = null;
          IStrategoTerm h_4862 = null;
          IStrategoTerm i_4862 = null;
          h_4862 = term;
          f_4862 = trans.const4556;
          i_4862 = h_4862;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4862, f_4862, trans.constCons2047);
          if(term == null)
            break Fail23573;
          if(true)
            break Success12625;
        }
        term = trans.constNil4;
      }
      c_4862 = term;
      term = e_4862;
      term = termFactory.makeTuple(c_4862, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7033.instance);
      if(term == null)
        break Fail23572;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}