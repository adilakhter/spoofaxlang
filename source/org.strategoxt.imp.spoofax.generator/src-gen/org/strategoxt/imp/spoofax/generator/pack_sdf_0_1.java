package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class pack_sdf_0_1 extends Strategy 
{ 
  public static pack_sdf_0_1 instance = new pack_sdf_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_4221)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pack_sdf_0_1");
    Fail25462:
    { 
      IStrategoTerm e_4221 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFILE_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25462;
      e_4221 = term.getSubterm(0);
      term = termFactory.makeAppl(SpoofaxGenerator._consIncludePathName_1, new IStrategoTerm[]{e_4221});
      term = termFactory.makeTuple(term, d_4221, generator.constNil7);
      term = graph_nodes_undef_3_0.instance.invoke(context, term, pack_sdf_parse_sdf_0_0.instance, lifted9012.instance, lifted9014.instance);
      if(term == null)
        break Fail25462;
      IStrategoTerm term10045 = term;
      Success10039:
      { 
        Fail25463:
        { 
          IStrategoTerm i_4221 = null;
          i_4221 = term;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25463;
          IStrategoTerm arg5852 = term.getSubterm(1);
          if(arg5852.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5852).isEmpty())
            break Fail25463;
          term = i_4221;
          { 
            term = $Fst_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25462;
            term = unzip_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25462;
            term = _2_0.instance.invoke(context, term, _Id.instance, $Concat$Modules_0_0.instance);
            if(term == null)
              break Fail25462;
            if(true)
              break Success10039;
          }
        }
        term = $Snd_0_0.instance.invoke(context, term10045);
        if(term == null)
          break Fail25462;
        term = map_1_0.instance.invoke(context, term, report_module_not_found_0_0.instance);
        if(term == null)
          break Fail25462;
        term = xtc_exit_0_0.instance.invoke(context, generator.const6989);
        if(term == null)
          break Fail25462;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}