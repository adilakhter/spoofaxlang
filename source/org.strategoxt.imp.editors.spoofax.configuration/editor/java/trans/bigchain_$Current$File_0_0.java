package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigchain_$Current$File_0_0 extends Strategy 
{ 
  public static bigchain_$Current$File_0_0 instance = new bigchain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentFile_0_0");
    Fail22989:
    { 
      IStrategoTerm t_4639 = null;
      IStrategoTerm v_4639 = null;
      v_4639 = term;
      Success12219:
      { 
        Fail22990:
        { 
          IStrategoTerm w_4639 = null;
          IStrategoTerm y_4639 = null;
          IStrategoTerm z_4639 = null;
          y_4639 = term;
          w_4639 = trans.const4485;
          z_4639 = y_4639;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4639, w_4639, trans.constCons2047);
          if(term == null)
            break Fail22990;
          if(true)
            break Success12219;
        }
        term = trans.constNil4;
      }
      t_4639 = term;
      term = v_4639;
      term = termFactory.makeTuple(t_4639, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6896.instance);
      if(term == null)
        break Fail22989;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}