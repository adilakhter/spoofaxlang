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

@SuppressWarnings("all") public class create_activator_0_0 extends Strategy 
{ 
  public static create_activator_0_0 instance = new create_activator_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_activator_0_0");
    Fail26704:
    { 
      IStrategoTerm l_4388 = null;
      IStrategoTerm o_4388 = null;
      IStrategoTerm s_4689 = null;
      term = get_main_class_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26704;
      l_4388 = term;
      term = get_package_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26704;
      o_4388 = term;
      term = termFactory.makeAppl(SpoofaxGenerator._consCompilationUnit_3, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consPackageDec_2, new IStrategoTerm[]{generator.constNil7, o_4388})}), generator.constCons5136, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consClassDec_2, new IStrategoTerm[]{generator.constClassDecHead0, termFactory.makeAppl(SpoofaxGenerator._consClassBody_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5060, generator.constClassOrInterfaceType5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId71, termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{l_4388}), (IStrategoList)generator.constNil7)})})}), (IStrategoList)generator.constNil7)}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consFieldDec_3, new IStrategoTerm[]{generator.constCons5060, generator.constClassOrInterfaceType5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consVarDec_2, new IStrategoTerm[]{generator.constId69, termFactory.makeAppl(SpoofaxGenerator._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consChars_1, new IStrategoTerm[]{l_4388}), (IStrategoList)generator.constNil7)})})}), (IStrategoList)generator.constNil7)}), (IStrategoList)generator.constCons5155))})}), (IStrategoList)generator.constNil7)});
      s_4689 = term;
      term = java_to_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26704;
      term = output_java_file_0_1.instance.invoke(context, s_4689, term);
      if(term == null)
        break Fail26704;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}