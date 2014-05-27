package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigchain_$Is$Import$Failed_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Import$Failed_0_0 instance = new bigchain_$Is$Import$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImportFailed_0_0");
    Fail76229:
    { 
      IStrategoTerm u_92095 = null;
      IStrategoTerm w_92095 = null;
      w_92095 = term;
      Success41836:
      { 
        Fail76230:
        { 
          IStrategoTerm x_92095 = null;
          IStrategoTerm z_92095 = null;
          IStrategoTerm a_92096 = null;
          z_92095 = term;
          x_92095 = trans.const15520;
          a_92096 = z_92095;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_92096, x_92095, trans.constCons7205);
          if(term == null)
            break Fail76230;
          if(true)
            break Success41836;
        }
        term = trans.constNil11;
      }
      u_92095 = term;
      term = w_92095;
      term = termFactory.makeTuple(u_92095, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21625.instance);
      if(term == null)
        break Fail76229;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}