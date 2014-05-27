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

@SuppressWarnings("all") public class chain_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static chain_$Decorated$Ast_0_0 instance = new chain_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_DecoratedAst_0_0");
    Fail22018:
    { 
      IStrategoTerm p_4294 = null;
      IStrategoTerm r_4294 = null;
      r_4294 = term;
      Success11895:
      { 
        Fail22019:
        { 
          IStrategoTerm s_4294 = null;
          IStrategoTerm u_4294 = null;
          IStrategoTerm v_4294 = null;
          u_4294 = term;
          s_4294 = trans.const4355;
          v_4294 = u_4294;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_4294, s_4294, trans.constCons1966);
          if(term == null)
            break Fail22019;
          if(true)
            break Success11895;
        }
        term = trans.constNil3;
      }
      p_4294 = term;
      term = r_4294;
      term = termFactory.makeTuple(p_4294, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6735.instance);
      if(term == null)
        break Fail22018;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}