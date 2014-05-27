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

@SuppressWarnings("all") public class chain_$Source$Dir_0_0 extends Strategy 
{ 
  public static chain_$Source$Dir_0_0 instance = new chain_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_SourceDir_0_0");
    Fail23468:
    { 
      IStrategoTerm a_4844 = null;
      IStrategoTerm c_4844 = null;
      c_4844 = term;
      Success12597:
      { 
        Fail23469:
        { 
          IStrategoTerm d_4844 = null;
          IStrategoTerm f_4844 = null;
          IStrategoTerm g_4844 = null;
          f_4844 = term;
          d_4844 = trans.const4552;
          g_4844 = f_4844;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4844, d_4844, trans.constCons2047);
          if(term == null)
            break Fail23469;
          if(true)
            break Success12597;
        }
        term = trans.constNil4;
      }
      a_4844 = term;
      term = c_4844;
      term = termFactory.makeTuple(a_4844, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6997.instance);
      if(term == null)
        break Fail23468;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}